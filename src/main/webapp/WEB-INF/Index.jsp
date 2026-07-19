<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jewellery_Booking_App_j2ee</title>

<script src="https://cdn.tailwindcss.com"></script>

</head>

<body class="bg-gray-100">

	<!-- Navbar -->

	<nav
		class="bg-black text-white flex justify-between items-center px-10 py-5 shadow-lg">

		<h1 class="text-3xl font-bold text-yellow-500">💎 Jewellery Booking</h1>

		<div class="space-x-6 text-lg">

			<a href="index.jsp" class="hover:text-yellow-400">Home</a>

			<a href="#about" class="hover:text-yellow-400">About</a>

			<a href="#contact" class="hover:text-yellow-400">Contact</a>

			<a href="login.jsp"
				class="bg-yellow-500 text-black px-5 py-2 rounded-lg font-semibold hover:bg-yellow-400">
				Login </a>

		</div>

	</nav>

	<!-- Hero Section -->

	<section
		class="flex flex-col md:flex-row items-center justify-between px-16 py-20 bg-gradient-to-r from-black via-gray-900 to-yellow-700 text-white">

		<div class="md:w-1/2">

			<h1 class="text-5xl font-bold leading-tight">

				Discover Your <span class="text-yellow-400">Dream Jewellery</span>

			</h1>

			<p class="mt-6 text-lg text-gray-300">

				Book premium gold, diamond and silver jewellery online with an
				elegant and secure booking experience.

			</p>

			<div class="mt-8 space-x-4">

				<a href="register.jsp"
					class="bg-yellow-500 text-black px-6 py-3 rounded-lg font-semibold hover:bg-yellow-400">
					Register </a>

				<a href="login.jsp"
					class="border border-white px-6 py-3 rounded-lg hover:bg-white hover:text-black">
					Login </a>

			</div>

		</div>

		<div class="md:w-1/2 flex justify-center mt-10 md:mt-0">

			<img src="images/banner.jpg" alt="Jewellery Banner"
				class="rounded-xl shadow-2xl w-96">

		</div>

	</section>

	<!-- Featured Jewellery -->

	<section class="py-16 px-10">

		<h2 class="text-4xl font-bold text-center mb-10 text-gray-800">

			Featured Collections

		</h2>

		<div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-8">

			<!-- Card 1 -->

			<div
				class="bg-white rounded-xl shadow-lg hover:shadow-2xl transition duration-300">

				<img src="images/ring.jpg"
					class="w-full h-60 object-cover rounded-t-xl">

				<div class="p-5">

					<h3 class="text-xl font-semibold">Gold Ring</h3>

					<p class="text-gray-500 mt-2">Elegant 22K Gold Ring</p>

					<p class="text-yellow-600 font-bold text-lg mt-3">₹45,000</p>

				</div>

			</div>

			<!-- Card 2 -->

			<div
				class="bg-white rounded-xl shadow-lg hover:shadow-2xl transition duration-300">

				<img src="images/chain.jpg"
					class="w-full h-60 object-cover rounded-t-xl">

				<div class="p-5">

					<h3 class="text-xl font-semibold">Gold Chain</h3>

					<p class="text-gray-500 mt-2">Premium Gold Chain</p>

					<p class="text-yellow-600 font-bold text-lg mt-3">₹78,000</p>

				</div>

			</div>

			<!-- Card 3 -->

			<div
				class="bg-white rounded-xl shadow-lg hover:shadow-2xl transition duration-300">

				<img src="images/necklace.jpg"
					class="w-full h-60 object-cover rounded-t-xl">

				<div class="p-5">

					<h3 class="text-xl font-semibold">Diamond Necklace</h3>

					<p class="text-gray-500 mt-2">Luxury Collection</p>

					<p class="text-yellow-600 font-bold text-lg mt-3">₹1,20,000</p>

				</div>

			</div>

			<!-- Card 4 -->

			<div
				class="bg-white rounded-xl shadow-lg hover:shadow-2xl transition duration-300">

				<img src="images/bracelet.jpg"
					class="w-full h-60 object-cover rounded-t-xl">

				<div class="p-5">

					<h3 class="text-xl font-semibold">Gold Bracelet</h3>

					<p class="text-gray-500 mt-2">Classic Gold Bracelet</p>

					<p class="text-yellow-600 font-bold text-lg mt-3">₹65,000</p>

				</div>

			</div>

		</div>

	</section>

	<!-- Footer -->

	<footer class="bg-black text-white text-center py-6">

		<p>&copy; 2026 Jewellery Booking App | JSP • Servlets • JDBC •
			MySQL</p>

	</footer>

</body>
</html>