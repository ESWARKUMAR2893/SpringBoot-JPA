<html>

<head>
 <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
<title>Login Application</title>

</head>

<body class="text-center">
   
   <form class="form-signin" method="post">
      <h1 class="h3 mb-3 font-weight-normal">Please Register here</h1>
    
    <font color="red">${error}</font>
    <label for="inputemail" class="sr-only">Email Id</label>
      <input type="text" id="inputemail" name="email" class="form-control" placeholder="Email id" required autofocus>
      
      <label for="inputFirstname" class="sr-only">Firstname</label>
      <input type="text" id="inputFirstname" name="firstname" class="form-control" placeholder="Username" required>
    
    <label for="inputLastname" class="sr-only">Lastname</label>
      <input type="text" id="inputLastname" name="lastname_notthere" class="form-control" placeholder="Lastname" required>
    
    
      <label for="inputPassword" class="sr-only">Password</label>
      <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
     
      <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
      <p> Already Registered ? <a href="/login" class="text-primary">login here</a> </p>
      <p class="mt-5 mb-3 text-muted">&copy; 2019-2020</p>
    </form>
 
 
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    
</body>

</html>