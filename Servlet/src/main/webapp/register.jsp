<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h1 {
	text-align: center;
}

#form {
	display: flex;
	flex-direction: column;
	justify-content: space-around;
	gap: 25px;
	width: max-content;
	margin: auto
}

.form-content {
	display: flex;
	flex-direction: row;
	justify-content: space-between;
	gap: 20px;
}
</style>
</head>
<body>
	<h1>Welcome to JAVA servlet</h1>
	<form id="form" action="Registration" method="post">
		<div class="form-content">
			<label>Full Name:</label> <input type="text" name="user_name">
		</div>
		<div class="form-content">
			<label>Email:</label> <input type="email" name="user_email">
		</div>
		<div class="form-content">
			<label>Password:</label> <input type="password" name="user_pass">
		</div>
		<div class="form-content">
			<label>Gender:</label> <input type="radio" name="user_gender"
				value="male"> Male <input type="radio" name="user_gender"
				value="female"> Female
		</div>
		<div class="form-content">
			<button type="submit">submit</button>
			<button type="reset">reset</button>
		</div>

	</form>
	

</body>
</html>