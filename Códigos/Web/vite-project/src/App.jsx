import { useState } from "react";
import Tasks from "./components/Tasks";
import AddTask from "./components/AddTask";
import TaskDescription from "./components/TaskDescription";

function App() {
  const [tasks, setTasks] = useState([
    {
      id: 1,
      title: "Fazer coisas",
      description: "Estudar os conceitos básicos do React",
      completed: false,
    },
    {
      id: 2,
      title: "Comprar coisas",
      description: "Pastel, sorvete, café",

      completed: false,
    },
  ]);

  const [selectedTask, setSelectedTask] = useState(null);

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

  function showTaskDescription(taskId) {
    const task = tasks.find((task) => task.id === taskId);
    setSelectedTask(task);
  }

  function closeTaskDescription() {
    setSelectedTask(null);
  }

  return (
    <div className="w-screen h-screen bg-slate-500 flex justify-center">
      <div className="w-2xl">
        <h1 className="text-3xl text-slate-100 font-bold text-center p-12">
          Gerenciador de tarefas
        </h1>

        <div className="flex flex-col space-y-4">
          <Tasks
            tasks={tasks}
            onTaskClick={onTaskClick}
            onShowDescription={showTaskDescription}
          />
          <AddTask addTask={addTask} />
          {selectedTask && (
            <TaskDescription
              task={selectedTask}
              onClose={closeTaskDescription}
            />
          )}
        </div>
      </div>
    </div>
  );
}

export default App;
