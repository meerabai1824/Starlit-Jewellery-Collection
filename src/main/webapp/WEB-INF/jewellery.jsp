<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jewellery Collection</title>

<script src="https://cdn.tailwindcss.com"></script>

</head>

<body class="bg-gray-100">

	<!-- Navbar -->

	<nav class="bg-black text-white shadow-lg">

		<div class="container mx-auto flex justify-between items-center p-5">

			<h1 class="text-3xl font-bold text-yellow-500">
				💎 Jewellery Booking
			</h1>

			<div class="space-x-6">

				<a href="home.jsp" class="hover:text-yellow-400">Home</a>

				<a href="cart.jsp" class="hover:text-yellow-400">Cart</a>

				<a href="bookingHistory.jsp" class="hover:text-yellow-400">Bookings</a>

				<a href="profile.jsp" class="hover:text-yellow-400">Profile</a>

			</div>

		</div>

	</nav>

	<!-- Heading -->

	<div class="container mx-auto mt-10">

		<h2 class="text-4xl font-bold text-center mb-8">

			Our Jewellery Collection

		</h2>

		<!-- Search -->

		<div class="flex justify-center mb-10">

			<input type="text"
				placeholder="Search Jewellery..."
				class="w-96 px-5 py-3 rounded-l-lg border">

			<button
				class="bg-yellow-500 px-6 rounded-r-lg hover:bg-yellow-600">

				Search

			</button>

		</div>

		<!-- Cards -->

		<div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-8">

			<!-- Card -->

			<div class="bg-white rounded-xl shadow-lg overflow-hidden hover:shadow-2xl">

				<img src="images/ring.jpg"
					class="w-full h-60 object-cover">

				<div class="p-5">

					<h3 class="text-xl font-bold">
						Gold Ring
					</h3>

					<p class="text-gray-500 mt-2">
						22K Hallmark Gold
					</p>

					<p class="mt-2">
						Weight :
						<span class="font-semibold">8 gm</span>
					</p>

					<p>
						Material :
						<span class="font-semibold">Gold</span>
					</p>

					<p class="text-2xl font-bold text-yellow-600 mt-3">
						₹45,000
					</p>

					<a href="AddToCartServlet?id=1"
						class="block text-center mt-5 bg-yellow-500 hover:bg-yellow-600 text-black py-2 rounded-lg">

						Add To Cart

					</a>

				</div>

			</div>

			<!-- Card -->

			<div class="bg-white rounded-xl shadow-lg overflow-hidden hover:shadow-2xl">

				<img src="images/chain.jpg"
					class="w-full h-60 object-cover">

				<div class="p-5">

					<h3 class="text-xl font-bold">
						Gold Chain
					</h3>

					<p class="text-gray-500 mt-2">
						Premium Chain
					</p>

					<p>Weight : <span class="font-semibold">20 gm</span></p>

					<p>Material : <span class="font-semibold">Gold</span></p>

					<p class="text-2xl font-bold text-yellow-600 mt-3">
						₹85,000
					</p>

					<a href="AddToCartServlet?id=2"
						class="block text-center mt-5 bg-yellow-500 hover:bg-yellow-600 text-black py-2 rounded-lg">

						Add To Cart

					</a>

				</div>

			</div>

			<!-- Card -->

			<div class="bg-white rounded-xl shadow-lg overflow-hidden hover:shadow-2xl">

				<img src="images/necklace.jpg"
					class="w-full h-60 object-cover">

				<div class="p-5">

					<h3 class="text-xl font-bold">
						Diamond Necklace
					</h3>

					<p class="text-gray-500 mt-2">
						Premium Collection
					</p>

					<p>Weight : <span class="font-semibold">35 gm</span></p>

					<p>Material : <span class="font-semibold">Diamond</span></p>

					<p class="text-2xl font-bold text-yellow-600 mt-3">
						₹1,20,000
					</p>

					<a href="AddToCartServlet?id=3"
						class="block text-center mt-5 bg-yellow-500 hover:bg-yellow-600 text-black py-2 rounded-lg">

						Add To Cart

					</a>

				</div>

			</div>

			<!-- Card -->

			<div class="bg-white rounded-xl shadow-lg overflow-hidden hover:shadow-2xl">

				<img src="images/bracelet.jpg"
					class="w-full h-60 object-cover">

				<div class="p-5">

					<h3 class="text-xl font-bold">
						Gold Bracelet
					</h3>

					<p class="text-gray-500 mt-2">
						Designer Bracelet
					</p>

					<p>Weight : <span class="font-semibold">15 gm</span></p>

					<p>Material : <span class="font-semibold">Gold</span></p>

					<p class="text-2xl font-bold text-yellow-600 mt-3">
						₹70,000
					</p>

					<a href="AddToCartServlet?id=4"
						class="block text-center mt-5 bg-yellow-500 hover:bg-yellow-600 text-black py-2 rounded-lg">

						Add To Cart

					</a>

				</div>

			</div>

		</div>

	</div>

	<footer class="bg-black text-white text-center py-5 mt-16">

		 2026 Jewellery Booking App

	</footer>

</body>
</html>