function Card({ title, children }) {
  return (
    <div className="w-full max-w-md bg-white rounded-xl shadow-xl p-8 transform transition-all hover:scale-102 duration-300">
      {title && (
        <h2 className="text-2xl font-bold text-center text-gray-800 mb-6">
          {title}
        </h2>
      )}
      {children}
    </div>
  );
}

export default Card;