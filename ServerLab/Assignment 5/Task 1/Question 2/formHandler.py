#!/usr/bin/env python3

from http.server import BaseHTTPRequestHandler, HTTPServer
import urllib.parse

class FormHandler(BaseHTTPRequestHandler):
    def do_GET(self):
        # Parse query parameters
        query_components = urllib.parse.parse_qs(urllib.parse.urlparse(self.path).query)
        name = query_components.get("name", ["Guest"])[0]
        email = query_components.get("email", ["Not provided"])[0]

        # Send HTTP response
        self.send_response(200)
        self.send_header("Content-Type", "text/html")
        self.end_headers()

        # Display response
        self.wfile.write(f"""
        <!DOCTYPE html>
        <html>
        <head>
            <title>Form Submission</title>
        </head>
        <body>
            <h2>Form Submitted Successfully</h2>
            <p><strong>Name:</strong> {name}</p>
            <p><strong>Email:</strong> {email}</p>
        </body>
        </html>
        """.encode("utf-8"))

# Run the server
if __name__ == "__main__":
    server_address = ("", 8080)
    httpd = HTTPServer(server_address, FormHandler)
    print("Server running on port 8080...")
    httpd.serve_forever()