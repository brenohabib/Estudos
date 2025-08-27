function operacao() {
  const users = [
    {
      id: 1,
      name: "Breno",
      email: "breno@example.com",
    },
    {
      id: 2,
      name: "Jennifer",
      email: "jennifer@example.com",
    },
  ];

  let db;
  const request = indexedDB.open("UmNomeQualquer", 1); // Adicione versão

  request.onerror = (event) => {
    console.log("Erro ao abrir o banco de dados:", event.target.error);
  };

  request.onsuccess = (event) => {
    db = event.target.result;
    console.log("Banco de dados aberto com sucesso");

    // Se o banco já existe e não precisa de upgrade, adicione os usuários aqui
    addUsers(db);
  };

  request.onupgradeneeded = (event) => {
    db = event.target.result;

    // Use o mesmo nome para a object store
    const objectStore = db.createObjectStore("users", {
      keyPath: "id",
      autoIncrement: false, // Como você já tem IDs definidos
    });

    // Adicione os usuários após a criação da object store
    objectStore.transaction.oncomplete = (event) => {
      addUsers(db);
    };
  };

  function addUsers(database) {
    const transaction = database.transaction(["users"], "readwrite");
    const userObjectStore = transaction.objectStore("users");

    users.forEach((user) => {
      const request = userObjectStore.add(user);
      request.onsuccess = () => {
        console.log(`Usuário ${user.name} adicionado com sucesso`);
      };
      request.onerror = (event) => {
        console.log(
          `Erro ao adicionar usuário ${user.name}:`,
          event.target.error
        );
      };
    });

    transaction.oncomplete = () => {
      console.log("Todos os usuários foram adicionados com sucesso!");
    };

    transaction.onerror = (event) => {
      console.log("Erro na transação:", event.target.error);
    };
  }
}

export default operacao;
