
<!DOCTYPE html>

<html lang="">
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
</head>
<body id="top">
<div class="wrapper row0">
  <div id="topbar" class="hoc clear">
    <div class="fl_left">
      <ul class="nospace">
        <li><i class="fa fa-phone"></i> +91 9876543210</li>
        <li><i class="fa fa-envelope-o"></i>info@trimos</li>
      </ul>
    </div>
    <div class="fl_right">
      <ul class="nospace">
        <li><a href="index.html"><i class="fa fa-lg fa-home"></i></a></li>
        <li><a href="about.html" target="_self">About</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
    </div>

  </div>
</div>
<div class="wrapper row1">
  <header id="header" class="hoc clear">
    <div id="logo" class="fl_left">

     <h1><a href="index.html"><img src="customLogo.png" style="width:128px;height:50px;"></img></a></h1>
    </div>
    <nav id="mainav" class="fl_right">
      <ul class="clear">
	        <li class="active"><a href="index.html">Home</a></li>
	        <li><a class="drop" href="#">Pages</a>


        </li>
    </nav>
  </header>
</div>



<div class="bgded overlay" style="background-image:url('images/demo/backgrounds/blur1.jpg');">
    <div id="pageintro" class="hoc clear">

      <article>
        <div>
          <p class="heading"></p>
       
          <p>Choose the type of department</p>
        </div>
		<form action="manager_dept_search">
    <select name="dept">
          <option>db</option>
          <option>proggrammer</option>
          <option>developer</option>
      </select>
    <br>
   


		<footer>
          <ul class="nospace inline pushright">
             <li><input class="btn inverse" type="submit" name="log" value="Search"></li>
			</ul>
        </footer>
      </form>
	  </article>

    </div>
  </div>

</div>


<script src="layout/scripts/jquery.min.js"></script>
<script src="layout/scripts/jquery.backtotop.js"></script>
<script src="layout/scripts/jquery.mobilemenu.js"></script>
<script src="layout/scripts/jquery.flexslider-min.js"></script>
<script src="layout/scripts/jquery.toptobottom.js"></script>
</body>
</html>
