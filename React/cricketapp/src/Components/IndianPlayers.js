function IndianPlayers() {

    const players = [
        "Virat",
        "Rohit",
        "Gill",
        "Rahul",
        "Pant",
        "Hardik"
    ];

    const odd = players.filter((_, i) => i % 2 === 0);

    const even = players.filter((_, i) => i % 2 === 1);

    const t20 = ["Virat", "Rohit"];

    const ranji = ["Jaiswal", "Sarfaraz"];

    const merged = [...t20, ...ranji];

    return (
        <div>

            <h2>Odd Team</h2>

            {odd.map(p => <p key={p}>{p}</p>)}

            <h2>Even Team</h2>

            {even.map(p => <p key={p}>{p}</p>)}

            <h2>Merged Players</h2>

            {merged.map(p => <p key={p}>{p}</p>)}

        </div>
    );
}

export default IndianPlayers;