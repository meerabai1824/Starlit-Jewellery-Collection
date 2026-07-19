<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment</title>

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

			</div>

		</div>

	</nav>

	<!-- Payment Section -->

	<div class="container mx-auto py-12 flex justify-center">

		<div class="bg-white shadow-xl rounded-xl w-full max-w-lg p-8">

			<h2 class="text-3xl font-bold text-center mb-8">
				Payment Details
			</h2>

			<form action="PaymentServlet" method="post">

				<div class="mb-6">

					<label class="font-semibold text-lg">
						Total Amount
					</label>

					<input type="text"
						value="₹1,30,000"
						readonly
						class="w-full mt-2 border rounded-lg px-4 py-3 bg-gray-100">

				</div>

				<div class="mb-6">

					<label class="font-semibold text-lg">
						Select Payment Method
					</label>

					<div class="mt-4 space-y-4">

						<label class="flex items-center gap-3">

							<input type="radio"
								name="paymentMethod"
								value="UPI"
								checked>

							UPI

						</label>

						<label class="flex items-center gap-3">

							<input type="radio"
								name="paymentMethod"
								value="Card">

							Debit / Credit Card

						</label>

						<label class="flex items-center gap-3">

							<input type="radio"
								name="paymentMethod"
								value="Cash">

							Cash on Pickup

						</label>

					</div>

				</div>

				<div class="mb-8">

					<label class="font-semibold text-lg">

						Payment Status

					</label>

					<input type="text"
						value="Pending"
						readonly
						class="w-full mt-2 border rounded-lg px-4 py-3 bg-gray-100">

				</div>

				<button
					type="submit"
					class="w-full bg-yellow-500 hover:bg-yellow-600 text-black font-bold py-3 rounded-lg">

					Confirm Booking

				</button>

			</form>

		</div>

	</div>

	<footer class="bg-black text-white text-center py-5 mt-10">

		© 2026 Jewellery Booking App

	</footer>

</body>
</html>