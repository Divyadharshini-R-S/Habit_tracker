import React, { useState } from 'react';
import AddHabitForm from './components/AddHabitForm';
import HabitList from './components/HabitList';
import { Habit } from './types';

function App() {
  const [habits, setHabits] = useState<Habit[]>([]);
  return (
    <div style={{padding:'1rem'}}>
      <h1>Habit Tracker</h1>
      <AddHabitForm onAdd={(h)=> setHabits(prev => [h, ...prev])}/>
      <HabitList habits={habits} setHabits={setHabits}/>
    </div>
  );
}

export default App;