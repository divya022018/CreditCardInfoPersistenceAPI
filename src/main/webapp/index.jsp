<html>
<style>
div {
    background-color: lightblue;
}
</style>
<body>
    <form>
        <br>Display All Credit Card Users Information:
        <input type="button" value="Display" onclick="callAllUsers()">
        </br>
        <br> Display User information (Enter Credit card number):
        	<td><input type="text" id="CardId1" > </td>
        	<td><input type="button" value="Display" onclick="callOneUsers()"></td>
        </br>
        <br>Add User Information: 
        	Credit Card number: <td><input type="text" id="CardId2" ></td>
        	Nick name: <td><input type="text" id="NickName" ></td>
     		User name: <td><input type="text" id="Name" ></td>
     		<td><input type="button" value="Add" onclick="callAddUser()"></td>
        </br>
        <br>Display All Credit Cards:
        	<input type="button" value="Display" onclick="callAll()">
        </br>
        <br>Search Card Type & Sub Type: 
        	Credit card number: <td><input type="text" id="CardId3" ></td>
     		<td><input type="button" value="Display" onclick="callSearchCard()"></td>
        </br>
        <br>Add Card Information: 
        	Credit card number: <td><input type="text" id="CardId4" ></td>
        	Credit card type: <td><input type="text" id="cardtype" ></td>
     		Credit card sub-type: <td><input type="text" id="subtype" ></td>
     		<td><input type="button" value="Add" onclick="callAddCard()"></td>
        </br>
    </form>
    <div id="response"></div>

    <script>
        function callAllUsers() {
        	var xhttp = new XMLHttpRequest();
            xhttp.onreadystatechange = function() {
                if (this.readyState == 4 && this.status == 200) {
                    document.getElementById("response").innerHTML = this.responseText;;
                }
            };
            xhttp.open("GET", "http://localhost:8080/CreditCardInfoPersistenceAPI/rest/creditCardInfo", true);
            xhttp.send();
        }
        
        function callOneUsers() {
        	var xhttp = new XMLHttpRequest();
            xhttp.onreadystatechange = function() {
                if (this.readyState == 4 && this.status == 200) {         	
                    document.getElementById("response").innerHTML = this.responseText;
                }
            };
            var url = "http://localhost:8080/CreditCardInfoPersistenceAPI/rest/creditCardInfo/"+ document.getElementById("CardId1").value;
            
            xhttp.open("GET",url , true);
            xhttp.send();
        }
        
        function callAddUser() {
        	var data = new FormData();
        	var cardid = document.getElementById("CardId2").value;
        	var nickname = document.getElementById("NickName").value;
        	var username = document.getElementById("Name").value;
        	if(cardid===""){
        		alert("Enter Card number");
        		return;
        	}
        	if(username===""){
        		alert("Enter User Name");
        		return;
        	}
        	data = "<?xml version='1.0'?><creditCardUserInfo>"+
        		'<cardid>'+cardid+'</cardid>';
        	if(nickname !== "")	{
        		data = data + '<nickname>'+nickname+'</nickname>';
        	}
        	data = data +  '<cardholdername>'+ username +'</cardholdername>'+ '</creditCardUserInfo>';
        		
        	var xhr = new XMLHttpRequest();
           	xhr.onreadystatechange = function() {
                if (this.readyState == 4 && this.status == 200) {
                	document.getElementById("response").innerHTML = xhr.responseText;
                }
            };
        	xhr.open('POST', 'http://localhost:8080/CreditCardInfoPersistenceAPI/rest/creditCardInfo'); 
            xhr.setRequestHeader('Content-Type', 'text/xml'); 
        	xhr.send(data);
        }
        
        function callAll() {
        	var xhttp = new XMLHttpRequest();
            xhttp.onreadystatechange = function() {
                if (this.readyState == 4 && this.status == 200) {
                    document.getElementById("response").innerHTML = this.responseText;
                }
            };
            xhttp.open("GET", "http://localhost:8080/CreditCardInfoPersistenceAPI/rest/creditCardInfo/creditCard", true);
            xhttp.send();
        }
        
        function callSearchCard() {
        	var xhttp = new XMLHttpRequest();
            xhttp.onreadystatechange = function() {
                if (this.readyState == 4 && this.status == 200) {
                    document.getElementById("response").innerHTML = this.responseText;
                }
            };
            var url = "http://localhost:8080/CreditCardInfoPersistenceAPI/rest/creditCardInfo/searchCardType/"+ document.getElementById("CardId3").value;
            xhttp.open("GET",url , true);
            xhttp.send();
        }
        
        function callAddCard() {
        	var data = new FormData();
        	var cardid = document.getElementById("CardId4").value;
        	var cardtype = document.getElementById("cardtype").value;
        	var subtype = document.getElementById("subtype").value;
        	data = "<?xml version='1.0'?><creditCardInfo>"+ '<bin>'+cardid+'</bin>';
        	data = data + '<cardsubtype>'+subtype+'</cardsubtype>';
        	data = data +  '<cardtype>'+ cardtype +'</cardtype>'+ '</creditCardInfo>';
        		
        	var xhr = new XMLHttpRequest();
        	xhr.onreadystatechange = function() {
                if (this.readyState == 4 && this.status == 200) {
                	document.getElementById("response").innerHTML = xhr.responseText;
                }
            };
        	xhr.open('POST', 'http://localhost:8080/CreditCardInfoPersistenceAPI/rest/creditCardInfo/addCardType'); 
            xhr.setRequestHeader('Content-Type', 'text/xml'); 
        	xhr.send(data);
        }
    </script>
</body>
</html>