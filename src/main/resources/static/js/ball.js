class Ball {
    canvasId;
    ctx;
    ctxForText;
    canvas;
    x = 100
    y = 100
    radius = 25
    lottoNum = 0;
    color = 0;
    fixedNums = []
    velX = (Math.random() * 15 + 5) * (Math.floor(Math.random() * 2) || -1)
    velY = (Math.random() * 15 + 5) * (Math.floor(Math.random() * 2) || -1)
    
    constructor(canvasId, ctx, lottoNum) {
        this.canvasId = canvasId;
        this.ctx = ctx;
        this.canvas = document.getElementById(canvasId);
        this.gravity = this.gravity * (Math.floor(Math.random() * 2) || -1);
        this.lottoNum = lottoNum;
        this.color = this.getBallColor(this.lottoNum);
    }
    draw() {
        this.ctx.beginPath();
        this.ctx.arc(this.x, this.y, this.radius, 0, Math.PI * 2, true);
        this.ctx.closePath();
        this.ctx.fillStyle = this.color
        this.ctx.strokeStyle = "black";
        this.ctx.stroke();
        this.ctx.fill();
        
        this.ctx.font = '20px Sunflower';
        this.ctx.fillStyle = "white";
        if (this.lottoNum < 10) {
            this.ctx.fillText(this.lottoNum, this.x-6, this.y+6);
        } else {
            this.ctx.fillText(this.lottoNum, this.x-12, this.y+6);
        }
    }
    clearRect() {
        ctx.clearRect(0,0, canvas.width, canvas.height);
    }
    update() {
        // bottom bound / floor
        if (this.y + this.radius >= canvas.height) {
            this.velY = -this.velY
            this.y = canvas.height - this.radius
        }
        // top bound / ceiling
        if (this.y - this.radius <= 0) {
            this.velY = -this.velY
            this.y = this.radius
        }
        // left bound
        if (this.x - this.radius <= 0) {
            this.velX = -this.velX
            this.x = this.radius
        }
        // right bound
        if (this.x + this.radius >= canvas.width) {
            this.velX = -this.velX
            this.x = canvas.width - this.radius
        }
        if (this.fixedNums.length >= 6) {
            if (this.fixedNums.indexOf(this.lottoNum) != -1) {
                if (this.y <= (canvas.height/2)+10 && this.y >= (canvas.height/2)-10) {
                    this.y = this.canvas.height/2;
                    this.x = this.fixedNums.indexOf(this.lottoNum) * (this,canvas.width/6)+35;
                    return;
                }
            } else {
                //나머지 아래로 
                if (this.y + this.radius >= canvas.height) {
                    this.velY = 0;
                    this.y = canvas.height;
                }
            }
        } 

        // update ball position
        this.x += this.velX
        this.y += this.velY
    }
    getBallColor(num) {
        if (num >= 0 && num <= 10) {
            return "#fbc400";
        }
        if (num >= 11 && num <= 20) {
            return "#69c8f2";
        }
        if (num >= 21 && num <= 30) {
            return "#ff7272";
        }
        if (num >= 31 && num <= 40) {
            return "#aaa";
        }

        if (num >= 41 && num <= 45){
            return "#b0d840";
        }
        return null;
    }
    fixnums(fixedNums) {
        this.fixedNums = fixedNums;
    }
}