import { useCallback, useState } from "react";
import Tasks from "./components/Tasks";
import AddTask from "./components/AddTask";
import TaskDescription from "./components/TaskDescription";

function App() {
  const [tasks, setTasks] = useState([]);
  const [selectedTask, setSelectedTask] = useState(null);
  const [editingTask, setEditingTask] = useState({
    title: "",
    description: "",
  });

  const handleAddTask = useCallback(() => {
    if (editingTask.title.trim() !== "") {
      setEditingTask({ title: "", description: "" });
    }
  }, [editingTask]);

  function onTaskClick(taskId) {
    const newTasks = tasks.map((task) => {
      if (task.id === taskId) {
        return {
          ...task,
          completed: !task.completed,
        };
      }
      return task;
    });
    setTasks(newTasks);
  }

  function addTask(title, description) {
    console.log("adicionado");
    const newTask = {
      id: tasks.length + 1,
      title,
      description,
      completed: false,
    };
    setTasks([...tasks, newTask]);
  }

  function deleteTask(taskId) {
    const newTasks = tasks.filter((task) => task.id !== taskId);
    setTasks(newTasks);
    closeTaskDescription();
  }

  function editTask(taskId, title, description) {
    setEditingTask({ title, description });
    closeTaskDescription();
    deleteTask(taskId);
  }

  function showTaskDescription(taskId) {
    const task = tasks.find((task) => task.id === taskId);
    setSelectedTask(task);
  }

  function closeTaskDescription() {
    setSelectedTask(null);
  }

  return (
    <div className="min-h-screen w-full bg-slate-500 flex justify-center">
      <div className="w-2xl">
        <h1 className="text-3xl text-slate-100 font-bold text-center p-12">
          Gerenciador de tarefas
        </h1>

        <div className="flex flex-col space-y-4">
          <AddTask addTask={addTask} editingTask={editingTask} />
          <Tasks
            tasks={tasks}
            onTaskClick={onTaskClick}
            onShowDescription={showTaskDescription}
          />
          {selectedTask && (
            <TaskDescription
              task={selectedTask}
              onClose={closeTaskDescription}
              onDelete={deleteTask}
              onEdit={editTask}
            />
          )}
        </div>
      </div>
    </div>
  );
}

export default App;
