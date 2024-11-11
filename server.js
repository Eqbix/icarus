const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();
const PORT = 3000;

app.use(cors());
app.use(bodyParser.json());

// Массив для хранения автомобилей
let cars = [
    { model: 'Rayfield Caliburn', year: 2070 },
    { model: 'Rayfield Aerondight', year: 2075 },
    { model: 'Rayfield Excalibur', year: 2076 },
];

// Эндпоинт для получения всех автомобилей
app.get('/api/cars', (req, res) => {
    res.json(cars);
});

// Эндпоинт для добавления нового автомобиля
app.post('/api/cars', (req, res) => {
    const newCar = req.body;
    cars.push(newCar);
    res.status(201).json(newCar);
});

// Эндпоинт для удаления автомобиля
app.delete('/api/cars/:model', (req, res) => {
    const model = req.params.model;
    cars = cars.filter(car => car.model !== model);
    res.status(204).send(); // Успешное удаление, без контента
});

app.listen(PORT, () => {
    console.log(`Сервер запущен на http://localhost:${PORT}`);
});
// solo