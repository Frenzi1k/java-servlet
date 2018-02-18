<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body bgcolor="#aaccff">
<Font color="green" size="10">
    Форма для работы со словарем
</Font>
<br>
<br>
<form name="dict" method="Post" accept-charset="UTF-8">
    <Font color="blue" size="6"> Введите слово:</Font><Input type="Text" name="txt" value="${word}"/>
    <br>
    <br>
    <Font color="blue" size="6">Перевод: </Font><input type="text" name ="trans" value="${translate}"/><br>
    <h4>Кликни здесь для получения перевода :<Input type="submit" value="Перевести"/>
    </h4>
</form>
</body>
</html>