const express = require('express');
const router = express.Router();

let usuarios = [
    {id: 1, nome: 'João Silva', email: 'joao.silva@email.com', senha: 'abc123'},
    {id: 2, nome: 'Maria Santos', email: 'maria.santos@email.com', senha: 'def456'},
    {id: 3, nome: 'Pedro Oliveira', email: 'pedro.oliveira@email.com', senha: 'ghi789'},
    {id: 4, nome: 'Ana Pereira', email: 'ana.pereira@email.com', senha: 'jkl012'},
    {id: 5, nome: 'Carlos Souza', email: 'carlos.souza@email.com', senha: 'mno345'}
]
let currentId = 1;

router.get('/', (req, res) => {
    res.status(200).json(usuarios);
})

router.post('/' , (req, res) => {
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

router.patch('/:id', (req, res) => {
    const { nome, email, senha } = req.body;
    const { id } = req.params;

    if (id != usuarios.id) {
        return res.status(404).json({'message': 'Usuario não encontrado'})
    }

    if (nome) {
        usuarios[id].nome = nome;
    }
    if (email) {
        usuarios[id].email = email;
    }
    if (senha) {
        usuarios[id].senha = senha;
    }
    
    res.status(200).json(usuarios[id])
})

router.delete('/:id', (req, res) => {
    const { id } = req.params;

    const userIndex = usuarios.findIndex(user => user.id === parseInt(id));
    if (userIndex !== -1) {
        usuarios.splice(userIndex, 1);
        return res.status(200).json({'message': 'Usuário do id ' + id + ' deletado com sucesso!'});
    }
    
    res.status(404).json({'message': 'Usuario não encontrado'})
})

module.exports = router;