function ListOfPlayers() {

    const players = [
        { name: "Virat", score: 92 },
        { name: "Rohit", score: 85 },
        { name: "Gill", score: 72 },
        { name: "Hardik", score: 68 },
        { name: "Jadeja", score: 61 },
        { name: "Rahul", score: 78 },
        { name: "Pant", score: 83 },
        { name: "Kuldeep", score: 44 },
        { name: "Bumrah", score: 39 },
        { name: "Shami", score: 50 },
        { name: "Siraj", score: 35 }
    ];

    return (
        <div>
            <h2>Players</h2>

            {players.map(player => (
                <p key={player.name}>
                    {player.name} - {player.score}
                </p>
            ))}

            <h2>Players Below 70</h2>

            {players
                .filter(player => player.score < 70)
                .map(player => (
                    <p key={player.name}>
                        {player.name}
                    </p>
                ))}
        </div>
    );
}

export default ListOfPlayers;