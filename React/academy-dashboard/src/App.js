import CohortDetails from "./Components/CohortDetails";
import cohorts from "./data";

function App() {

  return (

      <div>

        <h1>Academy Dashboard</h1>

        {

          cohorts.map(cohort => (

              <CohortDetails
                  key={cohort.id}
                  cohort={cohort}
              />

          ))

        }

      </div>

  );

}

export default App;