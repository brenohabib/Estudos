import { useState } from "react";
import FormButton from "./FormButton";

function FormInput({ onSubmit }) {
  const [input, setInput] = useState("");

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
      <FormButton />
    </form>
  );
}

export default FormInput;
