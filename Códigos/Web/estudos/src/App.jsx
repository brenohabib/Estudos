import { useState } from "react";
import operacao from "./indexed_db.jsx";

function App() {
  operacao();

  return (
    <div>
      <h1>Testando Cookies e IndexedDB</h1>
    </div>
  );
}

export default App;
