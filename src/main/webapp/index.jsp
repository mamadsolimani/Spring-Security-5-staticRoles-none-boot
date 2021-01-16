<html>
<body>
<h2> Hello World! 22</h2>

<p id="message"></p>

<script type="text/javascript">

	var url_string = document.URL;
	var url = new URL(url_string);
	var message = url.search;
	
	console.log(url_string);
	console.log(url);
	
	if ( message == "?error" ) {
		document.getElementById("message").innerHTML = "Error is Username Or Password !!!";
	}

</script>

<form action="/Spring_sec1/login" method="POST">

	<label>UserName:</label>
	<input name="username" />
	
	<br/><br/>
	
	<label>Password:</label>
	<input name="password" type="password" />
	
	<br/><br/>
	
	<input type="submit" value="Login" />

</form>

</body>
</html>
