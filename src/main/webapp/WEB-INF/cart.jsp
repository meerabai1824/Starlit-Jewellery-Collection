<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Cart</title>

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

				<a href="bookingHistory.jsp" class="hover:text-yellow-400">Bookings</a>

				<a href="profile.jsp" class="hover:text-yellow-400">Profile</a>

			</div>

		</div>

	</nav>

	<div class="container mx-auto py-10">

		<h2 class="text-4xl font-bold text-center mb-8">
			My Cart
		</h2>

		<div class="bg-white rounded-xl shadow-lg overflow-hidden">

			<table class="w-full">

				<thead class="bg-yellow-500 text-black">

					<tr>

						<th class="p-4">Image</th>

						<th>Name</th>

						<th>Price</th>

						<th>Quantity</th>

						<th>Total</th>

						<th>Action</th>

					</tr>

				</thead>

				<tbody>

					<tr class="text-center border-b">

						<td class="p-4">

							<img src="images/ring.jpg"
								class="w-20 h-20 mx-auto rounded">

						</td>

						<td>Gold Ring</td>

						<td>₹45,000</td>

						<td>

							<div class="flex justify-center items-center gap-3">

								<button
									class="bg-red-500 text-white px-3 rounded">

									-

								</button>

								<span>1</span>

								<button
									class="bg-green-500 text-white px-3 rounded">

									+

								</button>

							</div>

						</td>

						<td>₹45,000</td>

						<td>

							<a href="#"
								class="bg-red-500 text-white px-4 py-2 rounded">

								Remove

							</a>

						</td>

					</tr>

					<tr class="text-center border-b">

						<td class="p-4">

							<img src="images/chain.jpg"
								class="w-20 h-20 mx-auto rounded">

						</td>

						<td>Gold Chain</td>

						<td>₹85,000</td>

						<td>

							<div class="flex justify-center items-center gap-3">

								<button
									class="bg-red-500 text-white px-3 rounded">

									-

								</button>

								<span>1</span>

								<button
									class="bg-green-500 text-white px-3 rounded">

									+

								</button>

							</div>

						</td>

						<td>₹85,000</td>

						<td>

							<a href="#"
								class="bg-red-500 text-white px-4 py-2 rounded">

								Remove

							</a>

						</td>

					</tr>

				</tbody>

			</table>

		</div>

		<!-- Total -->

		<div class="mt-10 flex justify-end">

			<div class="bg-white shadow-lg rounded-xl p-8 w-96">

				<h3 class="text-2xl font-bold mb-5">
					Order Summary
				</h3>

				<div class="flex justify-between mb-3">

					<span>Total Items</span>

					<span>2</span>

				</div>

				<div class="flex justify-between mb-5">

					<span class="font-bold">Grand Total</span>

					<span class="font-bold text-yellow-600">

						₹1,30,000

					</span>

				</div>

				<a href="payment.jsp"
					class="block text-center bg-yellow-500 hover:bg-yellow-600 text-black py-3 rounded-lg font-semibold">

					Book Now

				</a>

			</div>

		</div>

	</div>

	<footer class="bg-black text-white text-center py-5 mt-10">

		© 2026 Jewellery Booking App

	</footer>

</body>
</html>