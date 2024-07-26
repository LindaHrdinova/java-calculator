[#ftl]

[@c.page]
    <form method="post" action="/result" class="calculator">
        <label>
            <input name="numberOne" required="required" class="calculator__number"/>
        </label>
        <label for="calcOperator"></label><select name="calcOperator" id="calcOperator">
            <option value="">Vyberte operaci</option>
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">&times;</option>
            <option value="/">÷</option>
            <option value="^">^</option>
        </select>
        <label>
            <input name="numberTwo" required="required" class="calculator__number"/>
        </label>
        <div>
            <button type="submit">Odeslat</button>
        </div>
    </form>
[/@c.page]