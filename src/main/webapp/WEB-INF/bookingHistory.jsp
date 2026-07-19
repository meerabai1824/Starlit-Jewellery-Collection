<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking History</title>

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

				<a href="profile.jsp" class="hover:text-yellow-400">Profile</a>

			</div>

		</div>

	</nav>

	<div class="container mx-auto py-10">

		<h2 class="text-4xl font-bold text-center mb-8">
			My Booking History
		</h2>

		<div class="bg-white rounded-xl shadow-lg overflow-hidden">

			<table class="w-full">

				<thead class="bg-yellow-500 text-black">

					<tr>

						<th class="p-4">Booking ID</th>

						<th>Jewellery</th>

						<th>Quantity</th>

						<th>Amount</th>

						<th>Payment</th>

						<th>Status</th>

					</tr>

				</thead>

				<tbody>

					<tr class="text-center border-b">

						<td class="p-4">101</td>

						<td>Gold Ring</td>

						<td>1</td>

						<td>₹45,000</td>

						<td>UPI</td>

						<td>

							<span
								class="bg-green-100 text-green-700 px-3 py-1 rounded-full">

								Success

							</span>

						</td>

					</tr>

					<tr class="text-center border-b">

						<td class="p-4">102</td>

						<td>Gold Chain</td>

						<td>1</td>

						<td>₹85,000</td>

						<td>Card</td>

						<td>

							<span
								class="bg-green-100 text-green-700 px-3 py-1 rounded-full">

								Success

							</span>

						</td>

					</tr>

					<tr class="text-center">

						<td class="p-4">103</td>

						<td>Diamond Necklace</td>

						<td>1</td>

						<td>₹1,20,000</td>

						<td>Cash</td>

						<td>

							<span
								class="bg-yellow-100 text-yellow-700 px-3 py-1 rounded-full">

								Pending

							</span>

						</td>

					</tr>

				</tbody>

			</table>

		</div>

		<div class="text-center mt-10">

			<a href="jewellery.jsp"
				class="bg-yellow-500 hover:bg-yellow-600 text-black px-8 py-3 rounded-lg font-semibold">

				Continue Shopping

			</a>

		</div>

	</div>

	<footer class="bg-black text-white text-center py-5 mt-10">

		© 2026 Jewellery Booking App

	</footer>

</body>
</html>