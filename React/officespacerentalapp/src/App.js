import React from 'react';

function App() {
  // Array of office objects as specified in the requirement
  const offices = [
    {
      id: 1,
      name: "DBS Tech Park",
      rent: 55000,
      address: "DLF Cyber City, Hyderabad"
    },
    {
      id: 2,
      name: "Mindspace IT Park",
      rent: 75000,
      address: "HITEC City, Hyderabad"
    },
    {
      id: 3,
      name: "Regus Commercial Hub",
      rent: 45000,
      address: "MG Road, Bengaluru"
    },
    {
      id: 4,
      name: "WeWork Spectrum",
      rent: 85000,
      address: "BKC, Mumbai"
    }
  ];

  // Inline CSS Styles object
  const styles = {
    container: {
      textAlign: 'center',
      fontFamily: 'Arial, sans-serif',
      padding: '20px',
      backgroundColor: '#f4f6f8',
      minHeight: '100vh'
    },
    heading: {
      color: '#1a252f',
      marginBottom: '20px',
      fontSize: '2.5rem'
    },
    bannerImage: {
      width: '80%',
      maxWidth: '700px',
      height: '300px',
      objectFit: 'cover',
      borderRadius: '12px',
      boxShadow: '0 4px 12px rgba(0, 0, 0, 0.15)',
      marginBottom: '30px'
    },
    grid: {
      display: 'flex',
      flexWrap: 'wrap',
      justifyContent: 'center',
      gap: '20px'
    },
    card: {
      backgroundColor: '#ffffff',
      border: '1px solid #e0e0e0',
      borderRadius: '8px',
      padding: '20px',
      width: '280px',
      boxShadow: '0 2px 8px rgba(0, 0, 0, 0.08)',
      textAlign: 'left'
    },
    officeName: {
      fontSize: '1.25rem',
      margin: '0 0 10px 0',
      color: '#2c3e50'
    },
    address: {
      color: '#7f8c8d',
      fontSize: '0.95rem',
      marginBottom: '10px'
    }
  };

  return (
    <div style={styles.container}>
      {/* Main Heading */}
      <h1 style={styles.heading}>Office Space Rental App</h1>

      {/* Office Image */}
      <img
        src="/office.jpg"
        alt="Modern Office Space"
        style={styles.bannerImage}
      />

      {/* List of Offices using map() */}
      <div style={styles.grid}>
        {offices.map((office) => {
          // Conditional inline CSS based on Rent value (< 60000 -> Red, >= 60000 -> Green)
          const rentStyle = {
            fontSize: '1.1rem',
            fontWeight: 'bold',
            color: office.rent < 60000 ? 'red' : 'green'
          };

          return (
            <div key={office.id} style={styles.card}>
              <h3 style={styles.officeName}>{office.name}</h3>
              <p style={styles.address}>
                <strong>Address:</strong> {office.address}
              </p>
              <p style={rentStyle}>
                <strong>Rent:</strong> ₹{office.rent.toLocaleString()} / month
              </p>
            </div>
          );
        })}
      </div>
    </div>
  );
}

export default App;
