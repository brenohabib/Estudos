import { useState, useEffect } from "react";

function AddTask(props) {
  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");

  useEffect(() => {
    if (props.editingTask) {
      setTitle(props.editingTask.title);
      setDescription(props.editingTask.description);
    }
  }, [props.editingTask]);

  const handleAddTask = () => {
    if (title.trim() !== "") {
      props.addTask(title, description);
      setTitle("");
      setDescription("");
    }
  };

  return (
    <div className="bg-slate-200 rounded-md shadow p-6">
      <div className="flex flex-col gap-8 pb-8 pt-4">
        <input
          className="focus:outline-none border-b-2 border-slate-400"
          type="text"
          placeholder="Nome da tarefa"
          value={title}
          onChange={(e) => setTitle(e.target.value)}
        />
        <textarea
          className="focus:outline-none border-b-2 border-slate-400"
          type="text"
          placeholder="Descrição da tarefa"
          value={description}
          onChange={(e) => setDescription(e.target.value)}
        />
      </div>
      <div className="flex justify-end">
        <button
          onClick={handleAddTask}
          className="bg-slate-400 cursor-pointer p-2 rounded-md text-white"
        >
          Adicionar
        </button>
      </div>
    </div>
  );
}

export default AddTask;
