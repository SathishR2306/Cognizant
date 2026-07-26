import ListOfPlayers from "./Components/ListOfPlayers";
import IndianPlayers from "./Components/IndianPlayers";

function App() {

  const flag = false;

  return (
      <div>

        {flag ? <ListOfPlayers /> : <IndianPlayers />}

      </div>
  );
}

export default App;