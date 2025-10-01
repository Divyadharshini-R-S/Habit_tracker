import React, { useState } from 'react';
import axios from 'axios';
import { Habit } from '../types';

interface Props { onAdd: (habit: Habit) => void; }

const AddHabitForm: React.FC<Props> = ({ onAdd }) => {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    if (!title.trim()) return;
    try {
      const res = await axios.post<Habit>('http://localhost:8080/api/habits', { title, description });
      onAdd(res.data);
      setTitle(''); setDescription('');
    } catch (err) {
      console.error('Add error', err);
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <input value={title} onChange={e => setTitle(e.target.value)} placeholder="Title" />
      <input value={description} onChange={e => setDescription(e.target.value)} placeholder="Description" />
      <button type="submit">Add Habit</button>
    </form>
  );
};

export default AddHabitForm;
