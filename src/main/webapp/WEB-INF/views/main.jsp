<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Mapa</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<link rel="stylesheet" href="resources/style.css">
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<!-- Mapa y Feed -->

	<div class="container mb-5 pt-4" class="row">

		<div class="row d-flex justify-content-center">
			<!-- mapa -->
			<div class="col-xs-12 col-sm-12 col-md-8 col-lg-8 col-xl-8 ">
				<div class="mapouter">
					<div class="gmap_canvas">
						<iframe width="700" height="500" id="gmap_canvas"
							src="https://maps.google.com/maps?q=2880%20Broadway,%20New%20York&t=&z=13&ie=UTF8&iwloc=&output=embed"
							frameborder="0" scrolling="no" marginheight="0" marginwidth="0">
						</iframe>
					</div>
				</div>
			</div>

			<!-- Feed -->
			<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4 col-xl-4 ">
				<a class="twitter-timeline" data-lang="es" data-width="500"
					data-height="500" data-theme="dark"
					href="https://twitter.com/reddeemergencia?ref_src=twsrc%5Etfw">Tweets
					by reddeemergencia</a>
			</div>
		</div>

	</div>

	<!-- Footer -->
	<%@include file="components/footer.jsp"%>

	<!-- Scripts -->
	<script
		src="https://maps.googleapis.com/maps/api/js?libraries=geometry,places&key=AIzaSyAvBQ1Q9FjYfxdWJF6KPmO822RMMbY2w2o"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
		integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
		crossorigin="anonymous"></script>
	<script src="resources/scripts/main.js"></script>
	<script async src="https://platform.twitter.com/widgets.js"
		charset="utf-8"></script>
</body>
</html>