// Функция для получения всех автомобилей
document.getElementById('getCarsButton').addEventListener('click', function() {
    fetch('http://localhost:3000/api/cars')
        .then(response => {
            if (!response.ok) {
                throw new Error('Сеть ответила с ошибкой');
            }
            return response.json();
        })
        .then(data => {
            const carList = document.getElementById('carList');
            carList.innerHTML = '';

            data.forEach(car => {
                const carItem = document.createElement('div');
                carItem.textContent = `Модель: ${car.model}, Год: ${car.year}`;
                carList.appendChild(carItem);
            });
        })
        .catch(error => {
            console.error('Ошибка при получении автомобилей:', error);
            alert('Произошла ошибка при получении данных. Проверьте консоль для подробностей.');
        });
});

// Функция для добавления нового автомобиля
document.getElementById('addCarButton').addEventListener('click', function() {
    const model = prompt('Введите модель автомобиля:');
    const year = prompt('Введите год автомобиля:');

    if (model && year) {
        const newCar = { model: model, year: year };

        fetch('http://localhost:3000/api/cars', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(newCar),
        })
        .then(response => {
            if (!response.ok) {
                throw new Error('Сеть ответила с ошибкой');
            }
            return response.json();
        })
        .then(data => {
            alert('Автомобиль успешно добавлен!');
        })
        .catch(error => {
            console.error('Ошибка при добавлении автомобиля:', error);
            alert('Произошла ошибка при добавлении автомобиля. Проверьте консоль для подробностей.');
        });
    } else {
        alert('Модель и год автомобиля должны быть заполнены.');
    }
});

// Функция для удаления автомобиля
document.getElementById('deleteCarButton').addEventListener('click', function() {
    const model = prompt('Введите модель автомобиля, который хотите удалить:');

    if (model) {
        fetch(`http://localhost:3000/api/cars/${model}`, {
            method: 'DELETE'
        })
        .then(response => {
            if (response.ok) {
                alert('Автомобиль успешно удален!');
                document.getElementById('getCarsButton').click();
            } else {
                throw new Error('Ошибка при удалении автомобиля');
            }
        })
        .catch(error => {
            console.error('Ошибка при удалении автомобиля:', error);
            alert('Произошла ошибка при удалении автомобиля. Проверьте консоль для подробностей.');
        });
    } else {
        alert('Модель автомобиля должна быть заполнена.');
    }
});
// solo