function TaskDescription(props) {
  return (
    <div className="fixed inset-0 flex justify-center overflow-auto bg-blend-multiply bg-black/30">
      <div className="bg-white p-6 rounded-lg shadow-lg max-w-2xl break-words">
        <h2 className="text-2xl font-bold break-words">{props.task.title}</h2>
        <p className="my-4 whitespace-pre-wrap break-words">
          {props.task.description}
        </p>
        <button
          onClick={props.onClose}
          className="mt-4 bg-slate-400 hover:bg-slate-500 text-white py-2 px-4 rounded cursor-pointer"
        >
          Fechar
        </button>
      </div>
    </div>
  );
}

export default TaskDescription;
