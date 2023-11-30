document.addEventListener('DOMContentLoaded', function () {
    // Variables para almacenar los datos
    let movimientos = [];
    const formulario = document.getElementById('formulario-factura');
    const movimientosBody = document.getElementById('movimientos-body');
    const totalGastosElement = document.getElementById('total-gastos');

    function mostrarMovimientos() {
        limpiarTabla();
        agregarMovimientosATabla();
        calcularTotalGastos();
    }

    function limpiarTabla() {
        movimientosBody.innerHTML = '';
    }

    function agregarMovimientosATabla() {
        movimientos.forEach(function (movimiento, index) {
            const nuevaFila = document.createElement('tr');
            nuevaFila.innerHTML = `
                <td>${index + 1}</td>
                <td>${movimiento.tipo}</td>
                <td>${movimiento.concepto}</td>
                <td>$${movimiento.monto.toFixed(2)}</td>
                <td><button onclick="eliminarMovimiento(${index})">Eliminar</button></td>
            `;
            movimientosBody.appendChild(nuevaFila);
        });
    }

    function calcularTotalGastos() {
        const totalGastos = movimientos.reduce((total, movimiento) => total + movimiento.monto, 0);
        totalGastosElement.innerHTML = `<p>Total de gastos: $${totalGastos.toFixed(2)}</p>`;
    }

    document.getElementById('agregar-movimiento').addEventListener('click', function () {
        const tipoMovimiento = document.getElementById('tipo-movimiento').value;
        const concepto = document.getElementById('concepto').value;
        const monto = parseFloat(document.getElementById('monto').value);

        if (isNaN(monto)) {
            alert('Por favor, ingrese un monto válido.');
            return;
        }

        const movimiento = {
            tipo: tipoMovimiento,
            concepto: concepto,
            monto: monto
        };

        movimientos.push(movimiento);
        formulario.reset();
        mostrarMovimientos();
    });

    window.eliminarMovimiento = function (index) {
        movimientos.splice(index, 1);
        mostrarMovimientos();
    };

    // Inicializar la página con movimientos existentes (si los hay)
    mostrarMovimientos();
});
