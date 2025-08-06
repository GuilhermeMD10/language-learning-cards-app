import React, { useEffect, useState } from "react";

function App() {
  const [message, setMessage] = useState("");

  useEffect(() => {
    fetch("/api/hello") // this will be proxied to localhost:8080 because of "proxy" in package.json
      .then((res) => res.text())
      .then((text) => setMessage(text))
      .catch((err) => setMessage("Error: " + err.message));
  }, []);

  return (
    <div>
      <h1>Backend says:</h1>
      <p>{message}</p>
    </div>
  );
}

export default App;
