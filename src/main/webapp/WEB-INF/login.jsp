<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<script src="https://cdn.tailwindcss.com"></script>

</head>

<body
	class="min-h-screen bg-gradient-to-r from-black via-gray-900 to-yellow-700 flex items-center justify-center">

	<div class="bg-white shadow-2xl rounded-2xl w-full max-w-md p-8">

		<div class="text-center">

			<h1 class="text-4xl font-bold text-yellow-600">💎</h1>

			<h2 class="text-3xl font-bold mt-2">Welcome Back</h2>

			<p class="text-gray-500 mt-2">Login to continue</p>

		</div>

		<form action="LoginServlet" method="post" class="mt-8 space-y-5">

			<div>

				<label class="block mb-2 font-semibold">Email</label>

				<input type="email" name="email"
					class="w-full border rounded-lg px-4 py-3 focus:outline-none focus:ring-2 focus:ring-yellow-500"
					placeholder="Enter Email" required>

			</div>

			<div>

				<label class="block mb-2 font-semibold">Password</label>

				<input type="password" name="password"
					class="w-full border rounded-lg px-4 py-3 focus:outline-none focus:ring-2 focus:ring-yellow-500"
					placeholder="Enter Password" required>

			</div>

			<div>

				<label class="block mb-2 font-semibold">Login As</label>

				<select name="role"
					class="w-full border rounded-lg px-4 py-3 focus:outline-none focus:ring-2 focus:ring-yellow-500">

					<option value="user">User</option>

					<option value="admin">Admin</option>

				</select>

			</div>

			<button
				class="w-full bg-yellow-500 hover:bg-yellow-600 text-white py-3 rounded-lg font-semibold transition">

				Login

			</button>

		</form>

		<div class="text-center mt-6">

			<p class="text-gray-600">

				Don't have an account?

				<a href="register.jsp"
					class="text-yellow-600 font-semibold hover:underline">

					Register

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