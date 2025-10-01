import React, { useEffect } from 'react';
import axios from 'axios';
import { Habit } from '../types';

interface Props { habits: Habit[]; setHabits: React.Dispatch<React.SetStateAction<Habit[]>>; }

const HabitList: React.FC<Props> = ({ habits, setHabits }) => {
  useEffect(() => {
    const fetch = async () => {
      try {
        const res = await axios.get<Habit[]>('/api/habits');
        setHabits(res.data);
      } catch (err) {
        console.error('Fetch error', err);
      }
    };
    fetch();
  }, [setHabits]);

  return (
    <ul>
      {habits.map(h => (
        <li key={h.id}>
          <strong>{h.title}</strong> — {h.description}
        </li>
      ))}
    </ul>
  );
};

export default HabitList;
