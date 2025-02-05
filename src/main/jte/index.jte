<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>reCAPTCHA Test</title>
    <script src="https://www.google.com/recaptcha/api.js" async defer></script>
</head>
<body>

<h2>Google reCAPTCHA v2 Test</h2>
<form action="/verify" method="POST">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>
    <br><br>
    <div class="g-recaptcha" data-sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI"></div>
    <br>
    <button type="submit">Submit</button>
</form>

</body>
</html>
