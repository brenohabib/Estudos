function TaskDescription(props) {
  return (
    <div className="fixed inset-0 flex justify-center bg-blend-multiply bg-black/30 p-8">
      <div className="bg-white p-6 rounded-lg shadow-lg md:min-w-3xl max-w-3xl max-h-3/4 overflow-auto relative">
        <h2 className="text-2xl font-bold break-words">{props.task.title}</h2>
        <p className="my-4 whitespace-pre-wrap break-words">
          {props.task.description}
        </p>

        <div className="fixed bottom-8 right-8">
          <button
            onClick={props.onClose}
            className="bg-slate-400 hover:bg-slate-500 text-white py-2 px-4 rounded cursor-pointer"
          >
            Fechar
          </button>
        </div>
      </div>
    </div>
  );
}

export default TaskDescription;
