function Tasks(props) {
  const buttonStyle = "bg-slate-400 cursor-pointer p-2 rounded-md text-white";

  function hasTasks(size) {
    if (size == 0) {
      return (
        <div className="justify-center items-center flex">
          <h1 className="text-3xl justify-center p-8">Sem Tarefas</h1>
        </div>
      );
    }
    return props.tasks.map((task) => (
      <li key={task.id} className="flex space-x-1">
        <button
          onClick={() => props.onTaskClick(task.id)}
          className={`${buttonStyle} text-left w-full ${
            task.completed && "line-through"
          }`}
        >
          {task.title}
        </button>
        <button
          className={`${buttonStyle} min-w-10`}
          onClick={() => props.onShowDescription(task.id)}
        >
          {">"}
        </button>
      </li>
    ));
  }

  return (
    <div>
      <ul className="space-y-4 p-6 bg-slate-200 rounded-md shadow">
        {hasTasks(props.tasks.length)}
      </ul>
    </div>
  );
}

export default Tasks;
