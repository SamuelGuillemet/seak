import numpy as np

DATA_PATH = "./data"

TARGET_DATE_REGEX = r"\d{4}-\d{2}-\d{2}"

CSV_COLUMNS = [
    "date",
    "X",
    "open",
    "high",
    "low",
    "close",
    "volume",
]

StockChartType = {
    "open": np.float64,
    "high": np.float64,
    "low": np.float64,
    "close": np.float64,
    "volume": np.int64,
}
