const express = require('express');

const app = express();
const PORT = 3000;

let usuario = {
    id: 1,
    nome: 'Breno',
    email: 'breno@email.com',
    senha: '99999999'
}

let currentId = 1;

app.get('/usuarios', (req, res) => {
    res.status(200).json(usuario);
})

app.post('/usuarios' , (req, res) => {
    const { nome, email, senha } = req.body;

    if (!nome || !email || !senha) {
        return res.status(400).json({'message': 'Preencha todos os campos'})
    }

    currentId += 1
    const newUsuario = {
        id: currentId,
        nome,
        email,
        senha
    }
    res.status(201).json(newUsuario)
})

app.patch('/usuarios/:id', (req, res) => {
    const { nome, email, senha } = req.body;
    const { id } = req.params;

    if (id != usuario.id) {
        return res.status(404).json({'message': 'Usuario não encontrado'})
    }
})

app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
})