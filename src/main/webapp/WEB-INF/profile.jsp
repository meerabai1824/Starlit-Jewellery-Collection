<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Profile</title>

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

			</div>

		</div>

	</nav>

	<!-- Profile -->

	<div class="container mx-auto py-12">

		<div class="max-w-2xl mx-auto bg-white rounded-xl shadow-lg p-8">

			<h2 class="text-3xl font-bold text-center mb-8">

				My Profile

			</h2>

			<form action="UserProfileServlet" method="post">

				<div class="mb-5">

					<label class="font-semibold">Full Name</label>

					<input type="text"
						name="userName"
						value="Meera"
						class="w-full border rounded-lg px-4 py-3 mt-2">

				</div>

				<div class="mb-5">

					<label class="font-semibold">Email</label>

					<input type="email"
						name="email"
						value="meera@gmail.com"
						class="w-full border rounded-lg px-4 py-3 mt-2">

				</div>

				<div class="mb-5">

					<label class="font-semibold">Phone</label>

					<input type="text"
						name="phone"
						value="9876543210"
						class="w-full border rounded-lg px-4 py-3 mt-2">

				</div>

				<div class="mb-5">

					<label class="font-semibold">Address</label>

					<textarea
						name="address"
						rows="4"
						class="w-full border rounded-lg px-4 py-3 mt-2">Bangalore, Karnataka</textarea>

				</div>

				<button
					type="submit"
					class="w-full bg-yellow-500 hover:bg-yellow-600 text-black font-bold py-3 rounded-lg">

					Update Profile

				</button>

			</form>

		</div>

	</div>

	<footer class="bg-black text-white text-center py-5 mt-10">

		© 2026 Jewellery Booking App

	</footer>

</body>
</html>