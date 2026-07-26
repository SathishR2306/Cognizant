import "../Stylesheets/mystyle.css";

function CalculateScore(props) {

    const average = props.total / props.goal;

    return (
        <div className="container">
            <h2>Student Details</h2>

            <p>Name : {props.name}</p>

            <p>School : {props.school}</p>

            <p>Total Marks : {props.total}</p>

            <p>Subjects : {props.goal}</p>

            <p>Average : {average}</p>
        </div>
    );
}

export default CalculateScore;