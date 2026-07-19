<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>

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

				<a href="jewellery.jsp" class="hover:text-yellow-400">Jewellery</a>

				<a href="cart.jsp" class="hover:text-yellow-400">Cart</a>

				<a href="bookingHistory.jsp" class="hover:text-yellow-400">Bookings</a>

				<a href="profile.jsp" class="hover:text-yellow-400">Profile</a>

				<a href="LogoutServlet" class="hover:text-red-400">Logout</a>

			</div>

		</div>

	</nav>

	<!-- Welcome Section -->

	<section class="bg-gradient-to-r from-black via-gray-900 to-yellow-700 text-white py-16">

		<div class="container mx-auto text-center">

			<h2 class="text-5xl font-bold">

				Welcome to Jewellery Booking

			</h2>

			<p class="mt-5 text-xl">

				Discover premium gold, diamond and silver jewellery.

			</p>

			<a href="jewellery.jsp"
				class="inline-block mt-8 bg-yellow-500 hover:bg-yellow-600 text-black px-8 py-3 rounded-lg font-semibold">

				Explore Jewellery

			</a>

		</div>

	</section>

	<!-- Quick Actions -->

	<section class="container mx-auto py-12">

		<h2 class="text-3xl font-bold text-center mb-10">

			Quick Actions

		</h2>

		<div class="grid md:grid-cols-4 gap-8">

			<div
				class="bg-white shadow-lg rounded-xl p-8 text-center hover:shadow-2xl">

				<div class="text-5xl">💍</div>

				<h3 class="text-xl font-bold mt-4">Jewellery</h3>

				<p class="text-gray-500 mt-2">

					View our jewellery collection.

				</p>

				<a href="jewellery.jsp"
					class="mt-5 inline-block bg-yellow-500 text-black px-5 py-2 rounded">

					View

				</a>

			</div>

			<div
				class="bg-white shadow-lg rounded-xl p-8 text-center hover:shadow-2xl">

				<div class="text-5xl">🛒</div>

				<h3 class="text-xl font-bold mt-4">My Cart</h3>

				<p class="text-gray-500 mt-2">

					View selected jewellery.

				</p>

				<a href="cart.jsp"
					class="mt-5 inline-block bg-yellow-500 text-black px-5 py-2 rounded">

					Cart

				</a>

			</div>

			<div
				class="bg-white shadow-lg rounded-xl p-8 text-center hover:shadow-2xl">

				<div class="text-5xl">📜</div>

				<h3 class="text-xl font-bold mt-4">

					Booking History

				</h3>

				<p class="text-gray-500 mt-2">

					View your previous bookings.

				</p>

				<a href="bookingHistory.jsp"
					class="mt-5 inline-block bg-yellow-500 text-black px-5 py-2 rounded">

					View

				</a>

			</div>

			<div
				class="bg-white shadow-lg rounded-xl p-8 text-center hover:shadow-2xl">

				<div class="text-5xl">👤</div>

				<h3 class="text-xl font-bold mt-4">

					My Profile

				</h3>

				<p class="text-gray-500 mt-2">

					Update your profile.

				</p>

				<a href="profile.jsp"
					class="mt-5 inline-block bg-yellow-500 text-black px-5 py-2 rounded">

					Profile

				</a>

			</div>

		</div>

	</section>

	<!-- Footer -->

	<footer class="bg-black text-white text-center py-5 mt-10">

		<p>

		2026 Jewellery Booking App | JSP • Servlets • JDBC • MySQL

		</p>

	</footer>

</body>
</html>