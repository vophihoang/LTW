$(document).ready(function() {
    const $buttonContainer = $(".button-container");
    // Tạo 64 button với các số từ 1 đến 64
    for (let i = 1; i <= 64; i++) {
        const $button = $("<button>")
            .addClass("number-button")
            .text(i)
            .appendTo($buttonContainer);

    }

    let expectedValue = 1; // Số tiếp theo cần nhấn

    // Xử lý sự kiện khi button được nhấn
    $buttonContainer.on("click", ".number-button", function() {
        const $clickedButton = $(this);
        const buttonValue = parseInt($clickedButton.text(), 10);

        if (buttonValue === expectedValue) {
            $clickedButton.addClass("hidden"); // ẩn button nếu đúng
            expectedValue++;
        } else {
            alert("Nhấn sai! Hãy nhấn vào button " + expectedValue);
        }

        // Kiểm tra nếu người chơi đã thắng
        if (expectedValue === 65) {
            alert("Chúc mừng! Bạn đã hoàn thành trò chơi!");
        }
    });
});
