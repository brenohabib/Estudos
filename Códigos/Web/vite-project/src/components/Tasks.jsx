function Tasks(props) {
  const buttonStyle = "bg-slate-400 cursor-pointer p-2 rounded-md text-white";

  return (
    <div>
      <ul className="space-y-4 p-6 bg-slate-200 rounded-md shadow">
        {props.tasks.map((task) => (
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
        ))}
      </ul>
    </div>
  );
}

export default Tasks;
