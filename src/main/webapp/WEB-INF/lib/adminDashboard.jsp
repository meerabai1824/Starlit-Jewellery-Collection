<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>

<script src="https://cdn.tailwindcss.com"></script>

</head>

<body class="bg-gray-100">

	<!-- Navbar -->

	<nav class="bg-black text-white shadow-lg">

		<div class="container mx-auto flex justify-between items-center p-5">

			<h1 class="text-3xl font-bold text-yellow-500">
				💎 Admin Dashboard
			</h1>

			<div class="space-x-6">

				<a href="adminDashboard.jsp" class="hover:text-yellow-400">Dashboard</a>

				<a href="LogoutServlet" class="hover:text-red-400">Logout</a>

			</div>

		</div>

	</nav>

	<!-- Dashboard Cards -->

	<div class="container mx-auto py-10">

		<h2 class="text-4xl font-bold text-center mb-10">

			Welcome Admin

		</h2>

		<div class="grid md:grid-cols-4 gap-6">

			<div class="bg-white rounded-xl shadow-lg p-6 text-center">

				<h3 class="text-lg font-semibold text-gray-600">Users</h3>

				<p class="text-4xl font-bold text-yellow-600 mt-3">25</p>

			</div>

			<div class="bg-white rounded-xl shadow-lg p-6 text-center">

				<h3 class="text-lg font-semibold text-gray-600">Jewellery</h3>

				<p class="text-4xl font-bold text-yellow-600 mt-3">18</p>

			</div>

			<div class="bg-white rounded-xl shadow-lg p-6 text-center">

				<h3 class="text-lg font-semibold text-gray-600">Bookings</h3>

				<p class="text-4xl font-bold text-yellow-600 mt-3">42</p>

			</div>

			<div class="bg-white rounded-xl shadow-lg p-6 text-center">

				<h3 class="text-lg font-semibold text-gray-600">Payments</h3>

				<p class="text-4xl font-bold text-yellow-600 mt-3">42</p>

			</div>

		</div>

		<!-- Management Section -->

		<div class="mt-12 bg-white rounded-xl shadow-lg p-8">

			<h3 class="text-2xl font-bold mb-8 text-center">

				Management

			</h3>

			<div class="grid md:grid-cols-2 lg:grid-cols-3 gap-6">

				<a href="AddJewelleryServlet"
					class="bg-yellow-500 hover:bg-yellow-600 text-center text-black font-semibold py-4 rounded-lg">

					➕ Add Jewellery

				</a>

				<a href="UpdateJewelleryServlet"
					class="bg-blue-500 hover:bg-blue-600 text-center text-white font-semibold py-4 rounded-lg">

					✏️ Update Jewellery

				</a>

				<a href="DeleteJewelleryServlet"
					class="bg-red-500 hover:bg-red-600 text-center text-white font-semibold py-4 rounded-lg">

					❌ Delete Jewellery

				</a>

				<a href="#"
					class="bg-green-500 hover:bg-green-600 text-center text-white font-semibold py-4 rounded-lg">

					👥 View Users

				</a>

				<a href="#"
					class="bg-purple-500 hover:bg-purple-600 text-center text-white font-semibold py-4 rounded-lg">

					📋 View Bookings

				</a>

				<a href="LogoutServlet"
					class="bg-black hover:bg-gray-800 text-center text-white font-semibold py-4 rounded-lg">

					🚪 Logout

				</a>

			</div>

		</div>

	</div>

	<footer class="bg-black text-white text-center py-5 mt-10">

		© 2026 Jewellery Booking App | Admin Panel

	</footer>

</body>
</html>