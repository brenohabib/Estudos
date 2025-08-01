import { useState } from 'react';

function FormInput({ onSubmit }) {
  const [input, setInput] = useState('');

  const handleInputChange = (e) => {
    setInput(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    onSubmit(input);
  };

  return (
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
        className="w-full bg-gradient-to-r from-blue-500 to-purple-600 text-white font-medium py-2 px-4 rounded-lg hover:opacity-90 transition-all duration-200 active:scale-95"
      >
        Enviar
      </button>
    </form>
  );
}

export default FormInput;