<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>

<script src="https://cdn.tailwindcss.com"></script>

</head>

<body
	class="min-h-screen bg-gradient-to-r from-black via-gray-900 to-yellow-700 flex items-center justify-center">

	<div class="bg-white shadow-2xl rounded-2xl w-full max-w-lg p-8">

		<div class="text-center">

			<h1 class="text-4xl font-bold text-yellow-600">💎</h1>

			<h2 class="text-3xl font-bold mt-2">Create Account</h2>

			<p class="text-gray-500 mt-2">
				Register to start booking jewellery
			</p>

		</div>

		<form action="RegisterServlet" method="post"
			class="mt-8 space-y-5">

			<div>

				<label class="block font-semibold mb-2">
					Full Name
				</label>

				<input type="text"
					name="userName"
					placeholder="Enter Full Name"
					required
					class="w-full border rounded-lg px-4 py-3 focus:outline-none focus:ring-2 focus:ring-yellow-500">

			</div>

			<div>

				<label class="block font-semibold mb-2">
					Email
				</label>

				<input type="email"
					name="email"
					placeholder="Enter Email"
					required
					class="w-full border rounded-lg px-4 py-3 focus:outline-none focus:ring-2 focus:ring-yellow-500">

			</div>

			<div>

				<label class="block font-semibold mb-2">
					Phone Number
				</label>

				<input type="text"
					name="phone"
					placeholder="Enter Phone Number"
					required
					class="w-full border rounded-lg px-4 py-3 focus:outline-none focus:ring-2 focus:ring-yellow-500">

			</div>

			<div>

				<label class="block font-semibold mb-2">
					Password
				</label>

				<input type="password"
					name="password"
					placeholder="Create Password"
					required
					class="w-full border rounded-lg px-4 py-3 focus:outline-none focus:ring-2 focus:ring-yellow-500">

			</div>

			<div>

				<label class="block font-semibold mb-2">
					Address
				</label>

				<textarea
					name="address"
					rows="3"
					placeholder="Enter Address"
					class="w-full border rounded-lg px-4 py-3 focus:outline-none focus:ring-2 focus:ring-yellow-500"></textarea>

			</div>

			<button
				type="submit"
				class="w-full bg-yellow-500 hover:bg-yellow-600 text-white py-3 rounded-lg font-semibold transition">

				Register

			</button>

		</form>

		<div class="text-center mt-6">

			<p class="text-gray-600">

				Already have an account?

				<a href="login.jsp"
					class="text-yellow-600 font-semibold hover:underline">

					Login

				</a>

			</p>

		</div>

		<div class="text-center mt-4">

			<a href="index.jsp"
				class="text-gray-500 hover:text-black text-sm">

				← Back to Home

			</a>

		</div>

	</div>

</body>
</html>