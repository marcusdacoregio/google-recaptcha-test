package gg.jte.generated.ondemand;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {22,22,22,22,22,22,22,22,22,22,22};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>reCAPTCHA Test</title>\n    <script src=\"https://www.google.com/recaptcha/api.js\" async defer></script>\n</head>\n<body>\n\n<h2>Google reCAPTCHA v2 Test</h2>\n<form action=\"/verify\" method=\"POST\">\n    <label for=\"name\">Name:</label>\n    <input type=\"text\" id=\"name\" name=\"name\" required>\n    <br><br>\n    <div class=\"g-recaptcha\" data-sitekey=\"6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI\"></div>\n    <br>\n    <button type=\"submit\">Submit</button>\n</form>\n\n</body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
