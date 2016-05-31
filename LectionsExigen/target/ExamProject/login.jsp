<html>
<%@ page language="java"
    contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
		<title>Login Page</title>


</head>
<script type ="text/javascript">
    function checkForm(form){
     alert("mmmmmmmmmmmmmmmmmmmm");
    var login = form.login.value;
    var password = form.password.value;

    var bad ="";
    if(login=="") bad += "آû يه ââهëè ëîمèي!\n";
    else if(login.length <5)
          +bad = "تîًîٍêèé ëîمèي!\n";
    if(password=="") +bad = "";
    else if (password=="") +bad="آû يه ââهëè ïàًîëü!\n";
    if(bad!=""){
    alert(bad);
    return false;
    }
    else return true;
    }
</script>
<form name="form" action=""  method="POST" onsubmit="returnt checkForm(this)">
login:<input type="text" name="login"/><br/><br/>
Password:<input type="password" name="password"/><br/><br/>
<input type="submit" value="login" onClick ="checkForm(this.form)" />
</form>

</div>

        <div id="footer">
            <hr>
                <p id="footerText">[ made by SPBU student ]</p>

        </div>

</body>
</html>