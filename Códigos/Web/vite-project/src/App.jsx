import "./App.css";
import Layout from "./components/Layout";
import Card from "./components/Card";
import FormInput from "./components/FormInput";

function App() {
  const handleFormSubmit = (inputValue) => {
    alert(`Formulário enviado: ${inputValue}`);
  };

  return (
    <Layout>
      <Card title="Digite seu nome">
        <FormInput onSubmit={handleFormSubmit} />
      </Card>
    </Layout>
  );
}

export default App;
