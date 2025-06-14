from datetime import datetime
from zoneinfo import ZoneInfo


def main() -> None:
    print('Hello, world!')
    rotterdam_time = datetime.now(ZoneInfo('Europe/Amsterdam'))
    print(
        'Current date and time in Rotterdam:',
        rotterdam_time.strftime('%Y-%m-%d %H:%M:%S'),
    )


if __name__ == '__main__':
    main()
