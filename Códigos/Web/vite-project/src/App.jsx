import { useState } from "react";
import "./App.css";

function App() {
  const [input, setInput] = useState("");

  const handleInputChange = (e) => {
    setInput(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    alert(`Formulário enviado: ${input}`);
  };

  return (
    <div className="min-h-screen flex items-center justify-center bg-gradient-to-br from-blue-100 to-purple-100 p-6">
      <div className="w-full max-w-md bg-white rounded-xl shadow-xl p-8">
        <h2 className="text-2xl font-bold text-center text-gray-800 mb-6">
          Digite seu nome
        </h2>

        <form className="space-y-6" onSubmit={handleSubmit}>
          <div className="space-y-2">
            <input
              className="w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-blue-500 focus:border-blue-500 transition-colors"
              type="text"
              id="fname"
              name="fname"
              value={input}
              onChange={handleInputChange}
              placeholder=". . ."
            />
          </div>

          <button
            type="submit"
            className="w-full
            bg-gradient-to-r
            from-blue-500 to-purple-600 text-white font-medium py-2 px-4 rounded-lg hover:opacity-90"
          >
            Enviar
          </button>
        </form>
      </div>
    </div>
  );
}

export default App;
